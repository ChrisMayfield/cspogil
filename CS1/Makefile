# Makefile for book.tex

all:
	cd ..; ./build.py CS1 Act
	./pax.sh

	pdflatex '\def\Teacher{}\input{book.tex}' > /dev/null
	pdflatex '\def\Teacher{}\input{book.tex}' > /dev/null
	pdflatex '\def\Teacher{}\input{book.tex}' > /dev/null
	mv book.pdf book_Teacher.pdf

	rm -f book.aux book.log book.out book.toc

	pdflatex '\def\Student{}\input{book.tex}' > /dev/null
	pdflatex '\def\Student{}\input{book.tex}' > /dev/null
	pdflatex '\def\Student{}\input{book.tex}' > /dev/null
	mv book.pdf book_Student.pdf

clean:
	cd ..; ./build.py clean
	rm -f */*.pax
	rm -f book.aux book.log book.out book.toc
