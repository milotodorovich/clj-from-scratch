(ns this-project.core-test
  (:require [clojure.test :as t]))

(t/deftest math-works-test
  (t/testing "Addition still solid"
    (t/is (= 3 (+ 1 1)))))

(comment
  ;; --reporter kaocha.report/documentation
  (t/run-all-tests)
  (t/run-tests 'this-project.core-test)
  ;;
  )
