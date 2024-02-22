#!/bin/bash
read -p "Enter age: " a
if [ $a -ge 18 ]
then
    echo "Eligible"
else
    echo "Not eligible"
fi