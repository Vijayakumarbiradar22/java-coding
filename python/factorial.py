def find_fact(num):
    factorial = 1
    for i in range(2, num + 1):
        factorial *= i
    return factorial

def main():
    num = int(input("Enter the number: "))
    result = find_fact(num)
    print(result)

if __name__ == "__main__":
    main()
