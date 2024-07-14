import type { AgnosticRoute } from "@vaadin/hilla-file-router/types.js";
import { createRoute } from "@vaadin/hilla-file-router/runtime.js";
import * as Page0 from "../views/@index.js";
import * as Page1 from "../views/chat.js";
import * as Page2 from "../views/person.js";
import * as Layout3 from "../views/@layout.js";
const routes: readonly AgnosticRoute[] = [
    createRoute("", Layout3, [
        createRoute("", Page0),
        createRoute("chat", Page1),
        createRoute("person", Page2)
    ])
];
export default routes;
