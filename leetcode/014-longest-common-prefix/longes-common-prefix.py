def longestCommonPrefix(strs: list[str]) -> str:
	min_len = min(len(s) for s in strs)
	result = ""
	for index in range(min_len):
		char = strs[0][index]
		if all(s[index] == char for s in strs):
			result += char
		else:
			break
	return result

strs = ["flower","flow","flight"]
print(longestCommonPrefix(strs))

strs = ["dog","racecar","car"]
print(longestCommonPrefix(strs))