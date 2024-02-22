#!/bin/bash
read -p"Enter 3 numbers: " a b c
if [ $a -gt $b ] && [ $a -gt $c ]
then
    echo $a "is greatest"
elif [ $b -gt $c ]
then
    echo $b "is greatest"  
else
    echo $c "is greatest"  
fi