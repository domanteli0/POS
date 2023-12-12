# PoS

## Tooling

__Build tool__: Gradle (run with `gradle bootRun`)

__IDE__: IntelliJ IDEA CE (it's free btw)

__Others__:
- https://editor.swagger.io

## Project generation

This project was generated from a swagger/OpenApi yaml [conf file](contract.yaml).

> [!NOTE]
> You shouldn't need to do these steps, to edit the project edit the generated protobuf files. I'm just documenting the steps.

> [!WARNING]
> Changing `contract.yaml` won't update `pos.proto` or generated java dto classes.

If you want to replicate the project here's the instructions:

1. Install [Go](https://go.dev/dl/)
2. convert `contract.yaml` to swagger spec v2 (this one is a little involved)
   1. Serve `contract.yaml` on a http server [this should do](https://crates.io/crates/sfz) (Just run `sfz .`)
   2. Use [this converter](https://github.com/LucyBot-Inc/api-spec-converter) by running `api-spec-converter --from=openapi_3 --to=swagger_2 --syntax=yaml http://127.0.0.1:[PORT]/contract.yaml > contractV2.yaml`
3. Set up [openapi2proto](https://github.com/nytimes/openapi2proto)
4. Generate a `.proto` file: `openapi2proto -spec contractV2.yaml -out src/main/proto/pos.proto -annotate`
> [!NOTE]
> `-annotate` adds http specific stuff.
5. Generate the project with https://start.spring.io.




