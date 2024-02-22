#!/bin/bash
read -p"Enter 2 numbers: " a b
if [ $a -gt $b ]
then
    echo $a "is greatest"  
elif [ $b -gt $a ]
then
    echo $b "is greatest"  
else
    echo "Both values are same"
fi