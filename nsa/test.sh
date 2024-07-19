filename=$1
even_count=0
odd_count=0

while l= read -r line; do
    line=$(echo "$line" | tr -d '[:space:]')
    if [ $((line % 2)) -eq 0 ]; then
        ((even_count++))
    else
        ((odd_count++))
    fi
done < "$filename"
echo "Even numbers: $even_count"
echo "Odd numbers: $odd_count"
