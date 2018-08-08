# Makefile for cs1book.tex

all:
	cd ..; ./build.py CS1 Act
	./pax.sh

	pdflatex '\def\Teacher{}\input{cs1book.tex}' > /dev/null
	pdflatex '\def\Teacher{}\input{cs1book.tex}' > /dev/null
	mv cs1book.pdf cs1book_Teacher.pdf

	pdflatex '\def\Student{}\input{cs1book.tex}' > /dev/null
	pdflatex '\def\Student{}\input{cs1book.tex}' > /dev/null
	mv cs1book.pdf cs1book_Student.pdf

clean:
	cd ..; ./build.py clean
	rm -f */*.pax
	rm -f cs1book.aux cs1book.log cs1book.out cs1book.toc
