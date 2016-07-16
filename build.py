"""Recursively builds PDF versions of each LaTeX file."""

import os
import sys

def build(path, name):
    root = os.getcwd()
    os.chdir(path)
    # create temp activity
    temp = open("temp.tex", "w")
    temp.write("\\documentclass[11pt]{article}\n")
    temp.write("\\usepackage{../../cspogil}\n")
    temp.write("\\begin{document}\n")
    temp.write("\\input{" + name + "}\n")
    temp.write("\\end{document}\n")
    temp.close()
    # build and clean temp
    os.system("pdflatex -interaction=nonstopmode temp.tex")
    os.rename("temp.pdf", name[:-3] + "pdf")
    os.remove("temp.aux")
    os.remove("temp.log")
    os.remove("temp.out")
    os.remove("temp.tex")
    os.chdir(root)

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
