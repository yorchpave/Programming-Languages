; A classic solution
(defn factorial
  [x]
  (apply * (range 1 (inc x))))

(factorial 6)


; Tail recursion
(defn factorial_tailRecursion [n]
    (loop [cnt n
           acc 1]
      (if (< cnt 2) acc
        (recur (dec cnt) (* cnt acc)))))

(factorial_tailRecursion 6)
