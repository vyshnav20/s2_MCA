#!/bin/bash
if [ $# -eq 1 ]
then 
    if [ -f $1 ]
    then
        echo "Reverse of $1"
        cat $1
        echo "-> "
        tac $1
    else
        echo "File does not exist!!"
    fi
else
    echo "Enter file name or path"
fi