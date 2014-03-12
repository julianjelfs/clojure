(ns beer)

(defn bottle [n]
  (if (> n 1)
    (format "%s bottles" n)
    (format "%s bottle" n)))

(defn verse [n]
  (let [next-bottle (bottle (dec n))
        this-bottle (bottle n)]
    (cond
     (= n 0) "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
     (= n 1) (format "%s of beer on the wall, %s of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n" this-bottle this-bottle )
     :else (format "%s of beer on the wall, %s of beer.\nTake one down and pass it around, %s of beer on the wall.\n" this-bottle this-bottle next-bottle ))))

(defn sing
  ([from] (sing from 0 ""))
  ([from to] (sing from to ""))
  ([from to so-far]
   (if (>= from to)
     (sing (dec from) to (format "%s%s\n" so-far (verse from)))
     (subs so-far 0 (- (count so-far) 1)) )))
