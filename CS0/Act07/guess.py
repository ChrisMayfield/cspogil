import random

name = raw_input("What is your name? ")
if name == "Chris":
    print "That's a great name!"
else:
    print "That's an okay name."
print

like = raw_input("Would you like to play guess my number? ")
if like == "yes":
    print "Great, let's play!"
else:
    print "Too bad, we're going to play anyway"
print

# random number between 1 and 100
number = random.randrange(100) + 1
guess = -1

while guess != number:
    guess = input("Guess my number: ")  # NOTE: input, not raw_input
    if guess < number:
        print "Too low!"
    if guess > number:
        print "Too high!"

print "You got it!"
