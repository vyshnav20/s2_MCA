#!/bin/bash
read -p"Enter new password: " p
read -p"Re-enter password: " pa
if [ $p != $pa ]
then echo "password do not match!!!"
else
    echo "password saved!!!"
fi