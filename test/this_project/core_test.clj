(ns this-project.core-test
  (:require [clojure.test :as t]))

(t/deftest math-works-test
  (t/testing "Addition still solid"
    (t/is (= 2 (+ 1 1)))))
