"""Generate LaTeX for including all activities."""

import glob
import sys

def main(suff):
    files = glob.glob("*/Act*.tex")
    for name in sorted(files):
        # get the title
        title = None
        for line in open(name):
            if line.startswith("\\title"):
                title = line[6:-1]
                break
        # output LaTeX
        print ""
        print "\\cleardoublepage\\phantomsection"
        print "\\addcontentsline{toc}{section}" + title
        print "\\includepdf[pages=-]{" + name[:-4] + "_" + suff + ".pdf}"

if __name__ == "__main__":
    if len(sys.argv) == 2:
        main(sys.argv[1])
    else:
        print("Usage: cs1book.py {Teacher | Student}")
