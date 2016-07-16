"""Recursively builds PDF versions of each LaTeX file."""

import os
import shutil
import sys

# command to use for os.system
LATEX = "pdflatex -interaction=nonstopmode"

# remove temporary output files
CLEAN = True

def build(path, name):
    """Build the given source file."""
    if name == "_TEMP_.tex":
        return
    print path, name,
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
    # build and rename pdf
    os.system(LATEX + " _TEMP_.tex > _TEMP_.run")
    status = os.system(LATEX + " _TEMP_.tex > _TEMP_.run")
    if status > 0:
        print "ERROR"
    else:
        print "OK"
        os.rename("_TEMP_.pdf", name[:-3] + "pdf")
    # clean up temp files
    if CLEAN:
        os.remove("_TEMP_.aux")
        os.remove("_TEMP_.log")
        os.remove("_TEMP_.out")
        os.remove("_TEMP_.run")
        os.remove("_TEMP_.tex")
    os.chdir(cwd)

def main(args):
    """Find and build all files."""
    for root in ["Activities", "Models"]:
        for path, dirs, files in os.walk(root):
            for name in files:
                if name.endswith(".tex"):
                    build(path, name)

if __name__ == "__main__":
    sys.exit(main(sys.argv))

# TODO build dict of file modification times
# TODO pdflatex teacher and student versions
# TODO sysargs: all, clean, student, teacher
