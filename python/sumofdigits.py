def main():
    num = int(input("Enter the number: "))
    total_sum = 0

    while num != 0:
        rem = num % 10
        total_sum += rem
        num = num // 10

    print(f"Sum of digits is {total_sum}")


if __name__ == "__main__":
    main()
