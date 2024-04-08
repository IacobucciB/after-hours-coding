def twoSum(nums: list[int], target: int) -> list[int]:
	for i,e in enumerate(nums):
		for j,f in enumerate(nums[i+1:], start=i+1):
			if(e+f == target):
				return [i,j]        
	return []

print("Two Sum")

eg1 = [2,7,11,15]
tgt1 = 9
print(twoSum(eg1,tgt1))

eg2 = [3,2,4]
tgt2 = 6
print(twoSum(eg2,tgt2))

eg3 = [3,3]
tgt3 = 6
print(twoSum(eg3,tgt3))
