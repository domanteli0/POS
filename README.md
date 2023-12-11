# PoS

## Tooling

Build tool: Maven (run with `gradle bootRUn`)

This project is developed with VS Code with these extensions:
- [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack)

## Project generation

This project was generated from a swagger/OpenApi yaml [conf file](contract.yaml).

> [!NOTE]
> You shouldn't need to do these steps, to edit the project edit the generated protobuf files. I'm just documenting the steps.

> [!WARNING]
> Changing `contract.yaml` won't update `pos.proto` or generated java dto classes.

If you want to replicate the project here's the instructions:

1. Install [Go](https://go.dev/dl/)
2. Set up [openapi2proto](https://github.com/nytimes/openapi2proto)
3. Generate a `.proto` file: `openapi2proto -spec contract.yaml -out pos.proto -annotate`
> [!NOTE]
> `-annotate` adds http specific stuff.
4. Generate the project with https://start.spring.io.




