; Fixed bug from code example given

(defn my-compare [a b]
    (cond (= a b) "equal"
          (< a b) "less" ; now there's an open parenthesis before "a" and closing parenthesis after "b"
          :else "greater"))

(my-compare 10 10) ; => equal
(my-compare 10 1) ; => equal
(my-compare 10 31) ; => equal
