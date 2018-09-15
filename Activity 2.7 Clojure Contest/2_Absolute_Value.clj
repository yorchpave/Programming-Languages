; If it's a number return absolute value. Otherwise return the value.

(defn absolute-value [x]
    (cond 
        (number? x) (Math/abs x)
        :else x
    )
)

(absolute-value -506)
