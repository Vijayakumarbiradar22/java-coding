def find_reverse(num):
    rev_num = 0
    while num != 0:
        rem = num % 10
        rev_num = rev_num * 10 + rem
        num = num // 10
    return rev_num


def main():
    num = int(input("Enter any number: "))
    result = find_reverse(num)
    print(result)

    if num == result:
        print("It is a Palindrome number")
    else:
        print("It is not a Palindrome number")


if __name__ == "__main__":
    main()
