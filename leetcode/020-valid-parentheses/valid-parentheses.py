def isValid(s: str) -> bool:
    stack = []
    brackets_map = {
        ')': '(',
        ']': '[',
        '}': '{'
    }
    
    for e in s:
        if e in brackets_map.values():
            stack.append(e)
        elif e in brackets_map.keys():
            if not stack or stack.pop() != brackets_map[e]:
                return False
    return not stack

s = "()"
print(isValid(s))

s = "()[]{}"
print(isValid(s))

s = "(]"
print(isValid(s))
