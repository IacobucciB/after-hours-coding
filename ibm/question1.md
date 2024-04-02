# Stock

An analyst is analyzing a stock over a period of n days. The price of the stock on the i-th day is price[ i ], and the profit obtained is denoted by profit[ i ]. The analyst want to pick a triplet of days ( i, j, k ) such that ( i < j < k ) and price[ i ] < price [ j ] < price [ k ] in such a way that the total profit, i.e. profit[ i ] + profit[ j ] + profit[ k ] is maximzed

Find the maximum total profit possible, if there is no valid triplet return -1

## Example  

Consider n = 5, price = [ 1, 5, 3, 4, 6 ], profit = [ 2, 3, 4, 5, 6 ]  
An optimal triplet (considering 1-based indexing) is ( 3, 4, 5 ). Here 3 < 4 < 6, and total profit = 4 + 5+ 6 = 15, the maximum possible. So, the answer is 15.

## Function Description

Complete the function getMaximumProfit in the editor below

```
getMaximuProfit has the following parameters:
    int price[ n ] : the prices of the stock on each day
    int profit[ n ] : the profits obtained from the stock on each day
```

Returns :
```
    long_int : the maximum possible total profit
```

Constrains

1 ≤ n ≤ 4000  
1 ≤ price[ i ] , profit[ i ] ≤ 10^9  

## Sample Case 0

## Sample Case 1

