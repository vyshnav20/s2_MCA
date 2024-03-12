ex=""
c=1
while [ $c -gt 0 ]
do
    echo "Expression: " $ex
    read -p "Enter an expression: " input
    if [ $input = "CE" ]
    then
        break
    fi
    ex="$ex$input"
    echo $ex
    for i in $(seq 1 $((${#ex})))
    do
        char=`expr substr ${ex} $i 1`
        if [ $char = "+" ]
        then
            ex=$((`expr substr ${ex} 1 $((i - 1))`  +  `expr substr ${ex} $((i + 1)) $((${#ex} - i))`))
            break
        elif [ $char = "-" ]
        then
            ex=$((`expr substr ${ex} 1 $((i - 1))`  -  `expr substr ${ex} $((i + 1)) $((${#ex} - i))`))
            break
        elif [ $char = "x" ]
        then
            ex=$((`expr substr ${ex} 1 $((i - 1))`  *  `expr substr ${ex} $((i + 1)) $((${#ex} - i))`))
            break
        elif [ $char = "/" ]
        then
            ex=$((`expr substr ${ex} 1 $((i - 1))`  /  `expr substr ${ex} $((i + 1)) $((${#ex} - i))`))
            break
        fi 
    done
done