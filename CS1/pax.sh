#!/bin/bash
#
# Runs PAX on each activity to extract pdf hyperlinks.
# See https://www.ctan.org/pkg/pax for more details.
#
# Prerequisites:
#   sudo apt install libfile-which-perl
#   pdfannotextractor --install

for f in Act*/Act*.pdf; do pdfannotextractor $f; done
