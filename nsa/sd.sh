#!/bin/bash
read -p "Enter number of elements: " n
list=()
sum=0
for i in $(seq 0 $(($n-1)))
do
    read -p "Enter lement $i : " a
    list[$i]=$a
    sum=$(($sum+$a))
done
mean=$(($sum / $n))
echo  "Mean = $mean"