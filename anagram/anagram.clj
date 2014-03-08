(ns anagram (:require [clojure.string :as str]))

(defn- sort-word [w] (apply str (sort w)))

(defn- is-anag? [w a]
  (let [lw (str/lower-case w) la (str/lower-case a)]
    (and (not= lw la) (= (sort-word lw) (sort-word la)))))

(defn anagrams-for [word, words]
  (let [p (fn [a] (is-anag? word a))]
    (filter p words )))
