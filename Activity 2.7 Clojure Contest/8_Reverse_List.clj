; Take any list and reverse its order

(def myList '(1 2 3 4 5 6))

(defn myReverse [my-list]
  (loop [r (rest my-list)
         acc (conj () (first my-list))]
    (if (= (count r) 0)
      acc
      (recur (rest r) (conj acc (first r))))))

  (myReverse myList)
