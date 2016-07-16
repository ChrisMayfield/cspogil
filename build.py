"""Recursively builds PDF versions of each LaTeX file."""

import os
import shutil

# command to use for os.system
LATEX = "pdflatex -interaction=nonstopmode"

# remove temporary output files
CLEAN = True

def latex(name, suff):
    """Run latex and rename pdf."""
    print "  " + suff,
    os.system(LATEX + " _TEMP_.tex > _TEMP_.run")
    status = os.system(LATEX + " _TEMP_.tex > _TEMP_.run")
    if status > 0:
        print "ERROR"
        return
    else:
        print "OK"
        os.rename("_TEMP_.pdf", name[:-4] + "-" + suff + ".pdf")

def build(path, name):
    """Build the given source file."""
    if name == "_TEMP_.tex":
        return
    print path, name
    cwd = os.getcwd()
    os.chdir(path)
    # create temp activity
    if path.startswith("Models/"):
        temp = open("_TEMP_.tex", 'w')
        temp.write("\\documentclass[11pt]{article}\n")
        temp.write("\\usepackage{../../cspogil}\n")
        temp.write("\\begin{document}\n")
        temp.write("\\input{" + name + "}\n")
        temp.write("\\end{document}\n")
        temp.close()
    else:
        shutil.copyfile(name, "_TEMP_.tex")
    latex(name, "Teacher")
    # patch student version (make answers white)
    temp = open("_TEMP_.tex", 'U')
    code = temp.readlines()
    temp.close()
    pos = code.index("\\begin{document}\n")
    code.insert(pos, "\\definecolor{answers}{HTML}{FFFFFF}\n")
    temp = open("_TEMP_.tex", 'w')
    temp.writelines(code)
    temp.close()
    latex(name, "Student")
    # clean up temp files
    if CLEAN:
        os.remove("_TEMP_.aux")
        os.remove("_TEMP_.log")
        os.remove("_TEMP_.out")
        os.remove("_TEMP_.run")
        os.remove("_TEMP_.tex")
    os.chdir(cwd)

def main():
    """Find and build all files."""
    for root in ["Activities", "Models"]:
        for path, dirs, files in os.walk(root):
            for name in files:
                if name.endswith(".tex"):
                    build(path, name)

if __name__ == "__main__":
    main()

# TODO build dict of file modification times
# TODO sysargs: all, clean, student, teacher
