import math

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True

def main():
    # Taking inputs
    a = int(input("Enter the first number: "))
    b = int(input("Enter the second number: "))

    # Validate input
    if a <= 0 or b <= 0 or a >= b or (b - a) <= 0:
        print("Provide valid input")
        return

    # Finding and printing prime numbers in the range [a, b]
    i = a
    while i <= b:
        if is_prime(i):
            print(i, end=" ")
        i += 1

if __name__ == "__main__":
    main()








import math

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True

def main():
    start = int(input("Enter the start number: "))
    end = int(input("Enter the end number: "))
    
    for i in range(start, end):
        if is_prime(i):
            print(i, end=" ")

if __name__ == "__main__":
    main()
