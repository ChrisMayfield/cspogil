"""Recursively builds PDF versions of each LaTeX file."""

import os
import sys

def build(path, name):
    print path, name,
    cwd = os.getcwd()
    os.chdir(path)
    # create temp activity
    temp = open("temp.tex", "w")
    temp.write("\\documentclass[11pt]{article}\n")
    temp.write("\\usepackage{../../cspogil}\n")
    temp.write("\\begin{document}\n")
    temp.write("\\input{" + name + "}\n")
    temp.write("\\end{document}\n")
    temp.close()
    # build and rename pdf
    os.system("pdflatex -interaction=nonstopmode temp.tex > temp.csm")
    status = os.system("pdflatex -interaction=nonstopmode temp.tex > temp.csm")
    if status > 0:
        print "ERROR"
    else:
        print "OK"
        os.rename("temp.pdf", name[:-3] + "pdf")
    # clean up temp files
    os.remove("temp.aux")
    os.remove("temp.csm")
    os.remove("temp.log")
    os.remove("temp.out")
    os.remove("temp.tex")
    os.chdir(cwd)

def main(args):
    # build all models
    for path, dirs, files in os.walk("Models"):
        for name in files:
            if name.endswith(".tex"):
                # TODO check both file modification times
                # TODO build teacher and student versions
                build(path, name)
    # TODO build activities
    pass

if __name__ == '__main__':
    # TODO support for all, clean, student, teacher
    sys.exit(main(sys.argv))
