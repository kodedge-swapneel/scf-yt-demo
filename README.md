# Spring Cloud Function 

## [Click here to watch the Lectures.](https://youtu.be/ketK1L1KLKo)

This is a repository for code shown in the lectures. You can directly deploy this function on AWS Lambda service.

- To create jar, Run `mvn clean install`
- Upload jar which has aws in the jar name, on the AWS Lambda service.
- Change Invoker : `org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest`
- To call function either add environment variable : `spring_cloud_function_definition : functionName`
- Or send following event: 
    ```
    {
        "payload": "swapneel",
        "headers": {
               "spring.cloud.function.definition": "upperCase"
        }
    }
    ```

