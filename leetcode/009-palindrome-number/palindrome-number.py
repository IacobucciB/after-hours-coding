def isPalindrome(x: int) -> bool:
    if str(x) == str(x)[::-1]:
        return True
    return False

print("Palindrome Number")

x = 121
print(isPalindrome(x))

x = -121
print(isPalindrome(x))

x = 10
print(isPalindrome(x))
