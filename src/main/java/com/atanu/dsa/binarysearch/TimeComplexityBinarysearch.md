# Time complexity for binary search

Generally its O(**log n**). Suppose there are 16 elements.
So, for reaching one element from a set of 16 elements, we had to divide the array 4 times,

We can say that,

![](https://hackernoon.com/hn-images/1*4wH4sn6FBsAPnVHjIMdhTA.png)

Simplified Formula

Similarly, for n elements,

![](https://hackernoon.com/hn-images/1*b4wakMYiYlBXb99b-eYJ9w.png)

Generalization

![](https://hackernoon.com/hn-images/1*XwWCLuB2Zb0zQjSQo7wpbQ.png)

Separating the power for the numerator and denominator

![](https://hackernoon.com/hn-images/1*lHNSYMPysioxVc38BvokAw.png)

Multiplying both sides by 2^k

![](https://hackernoon.com/hn-images/1*y10tlmCach8Uefc3n3d5aA.png)

Final result

Now, let us look at the definition of logarithm, it says that

> A quantity representing the power to which a fixed number (the base) must be raised to produce a given number.

Which makes our equation into

![](https://hackernoon.com/hn-images/1*qVSjYPYo9t4QNoLP8FZFWw.png)
