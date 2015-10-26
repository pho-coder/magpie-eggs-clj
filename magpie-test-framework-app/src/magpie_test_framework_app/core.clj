(ns magpie-test-framework-app.core
  (:gen-class)
  (:require [taoensso.timbre :as timbre]
            [com.jd.bdp.magpie.magpie-framework-clj.task-executor :as task-executor]))

(defn run-fn [job-id]
  (timbre/info (System/currentTimeMillis))
  (timbre/info "run")
  (Thread/sleep 3000))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (try
    (task-executor/execute run-fn)
    (catch Throwable e
      (prn e)
      (prn "bye"))))
