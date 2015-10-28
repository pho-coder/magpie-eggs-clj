(ns com.jd.bdp.magpie.magpie-eggs-clj.magpie-test-framework-app.core
  (:gen-class)
  (:require [clojure.tools.logging :as log]
            [com.jd.bdp.magpie.magpie-framework-clj.task-executor :as task-executor]))

(defn run-fn [job-id]
  (log/info (System/currentTimeMillis))
  (log/info "run")
  (Thread/sleep 3000))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (log/info "Hello, World!")
  (try
    (task-executor/execute run-fn)
    (catch Throwable e
      (log/error e)
      (log/info "bye"))))
