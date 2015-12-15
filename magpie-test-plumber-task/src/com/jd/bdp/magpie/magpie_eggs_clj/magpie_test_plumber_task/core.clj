(ns com.jd.bdp.magpie.magpie-eggs-clj.magpie-test-plumber-task.core
  (:gen-class)
  (:require [clojure.tools.logging :as log]
            [com.jd.bdp.magpie.magpie-framework-clj.task-executor :as task-executor]))

(defn prepare-fn
  [task-id]
  (let [albatross-path "/albatross"
        job-id ()]))

(defn run-fn [task-id]
  (log/info (System/currentTimeMillis))
  (log/info "run")
  (Thread/sleep 3000))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (log/info "Hello, World!")
  (try
    (task-executor/execute run-fn :prepare-fn prepare-fn)
    (catch Throwable e
      (log/error e)
      (log/info "bye"))))
