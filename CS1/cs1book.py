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
                title = line[7:-2]
                break
        # output results
        if suff == "tex":
            print "\\act{" + title + "}{" + name[:-4] + "}"
        else:
            title = title[title.find(":")+2:]
            name = name[:name.find("/")]
            print "[" + title + "](" + name + ")"

if __name__ == "__main__":
    if len(sys.argv) == 2:
        main(sys.argv[1])
    else:
        print("Usage: cs1book.py {tex | md}")
