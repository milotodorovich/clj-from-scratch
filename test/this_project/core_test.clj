(ns this-project.core-test
  (:require [clojure.test :as t]
            [this-project.core :as sut]))

(t/deftest math-works-test
  (t/testing "Addition still solid"
    (t/is (= 2 (+ 1 1)))))

(t/deftest coverage
  (t/testing "add"
    (t/is (= 2 (sut/add 1 1)))
    (t/is (= 7 (sut/add 3 4)))))

(comment
  ;; --reporter kaocha.report/documentation
  (t/run-all-tests)
  (t/run-tests 'this-project.core-test)
  ;;
  )
