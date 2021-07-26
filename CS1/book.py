"""Generate LaTeX for including all activities."""

import glob
import sys

def main(suff):
    files = glob.glob("Act*/Act*.tex")
    for name in sorted(files):
        # get the title
        title = None
        for line in open(name):
            if line.startswith("\\title"):
                title = line[7:-2]
                break
        # output results
        if suff == "tex":
            print "\\act{" + name[:-4] + "}{" + title + "}{"
        else:
            name = name[:name.find("/")]
            print "* [" + title + "](" + name + ")"
            continue
        # get model names (LaTeX only)
        mods = []
        path = name[:name.rfind("/") + 1]
        for line in open(name):
            if line.startswith("\\input"):
                if not line.endswith(".sty}\n"):
                    mods.append(path + line[7:-2])
        # output models
        i = 0
        for name in mods:
            for line in open(name):
                if line.startswith("\\model"):
                    i += 1
                    print "\\mod{" + str(i) + "}",
                    print line[7:-2], "\\\\"
                if line.startswith("\\section*"):
                    print "\\indent",
                    print line[10:-2], "\\\\"
        print "}"

if __name__ == "__main__":
    if len(sys.argv) == 2:
        main(sys.argv[1])
    else:
        print("Usage: book.py {tex | md}")
