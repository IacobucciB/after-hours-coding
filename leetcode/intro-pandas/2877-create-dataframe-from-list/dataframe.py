import pandas as pd

def createDataFrame(student_data: list[list[int]]) ->pd.DataFrame:
    return pd.DataFrame(data=student_data, columns=['student_id', 'age'])
 

student_data = [
  [1, 15],
  [2, 11],
  [3, 11],
  [4, 20]
]

dataframe = createDataFrame(student_data)
print(dataframe)