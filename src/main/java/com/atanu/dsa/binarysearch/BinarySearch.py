def binary_search(list,item):
    low = 0;
    high = len(list) - 1;
    list.sort();
    while(low<=high):
        mid = (low + high)
        guess = list[mid]
        if guess == item:
            return True
        if guess > item:
            high = mid - 1
        else:
            low = mid + 1
    return False

my_list = [1,3,8,4,5,11,9]

print ("Element present in the list: ",binary_search(my_list, 8))
           


