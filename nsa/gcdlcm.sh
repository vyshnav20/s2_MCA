#!/bin/bash
read -p "Enter 2 numbers: " a b
m=$a
if [ $b -lt $m ]
then
    m=$b
fi
while [ $m -gt 0 ]
do
    x=$(expr $a % $m)
    y=$(expr $b % $m)
    if [ $x -eq 0 -a $y -eq 0 ]
    then
        echo "GCD of $a and $b = $m"
    break
    fi
    m=$(expr $m - 1)
done

l=$(expr $a \* $b / $m)
echo "LCM of $a and $b = $l"
