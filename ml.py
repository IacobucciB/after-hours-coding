from random import random

def cost(w):
    result = 0
    for i,e in enumerate(train):
        x = train[i][0]
        y = x * w
        d = y - train[i][1]
        result += d * d
        # print("Actual: " + str(y) + " Expected: " + str(train[i][1]))
    result = result / len(train)
    return result

train = [
    [0, 0],
    [1, 2],
    [2, 4],
    [3, 6],
    [4, 8],
]

w = random() * 10

c = cost(w)

print(c)