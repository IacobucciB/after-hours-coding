def romanToInt(s: str) -> int:
	roman_values = {
    	'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
	}
	total = 0
	prev_value = 0
	for numeral in reversed(s):
		value = roman_values[numeral]
		if value < prev_value:
			total = total - value
		else:
			total = total + value
			prev_value = value
	return total

s = "III"
print(romanToInt(s))

s = "LVIII"
print(romanToInt(s))

s = "MCMXCIV"
print(romanToInt(s))
