arr=[2,4,6];
def recursionSum(arr):
    if len(arr)==1:
        return arr[0];
    else:
        
        return arr.pop(0) + recursionSum(arr);
print(recursionSum(arr));




