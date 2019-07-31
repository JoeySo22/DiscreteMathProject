import sys

'''
    We call this program by using the args.
    1. Make sure you are in the same directory of the program
    2. Enter the command:
        python GCD.py FIRST_NUMBER SECOND_NUMBER
    3. The result will print out.
'''

# This is set up for invalid arguements.
class InvalidGCDArguement(Exception):
    pass

#This is the main function. Inside we use it to orient which of the two integer. Greatest on the left.
def main(x, y):
    if (x > y):
        return EuclidianAlgorithm(x,y)
    else:
        return EuclidianAlgorithm(y,x)

#Recursive Euclidian Algorithm function
def EuclidianAlgorithm(x,y):
    if (y == 0):
        return x
    return EuclidianAlgorithm(y, x%y)

# We check to make sure all the arguements are straight.
#if (len(sys.argv) == 3):
   # if (int(sys.argv[1]) < 1 or int(sys.argv[2]) < 1):
        #raise InvalidGCDArguement

    #We call the program here.
print(main(int(sys.argv[1]), int(sys.argv[2])))
