import math

def is_prime(num):
    if num < 2:
        return False
    for i in range(2,int(math.sqrt(num))+1):
        if num % i == 0:
            return False
    return True

def main():
    num = int(input("Enter the number"))
    if is_prime(num):
        print(f"{num} is prime number.")
    else:
        print(f"{num} is not prime number")

if __name__ == "__main__":
    main()



