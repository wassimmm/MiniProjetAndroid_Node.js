import express from 'express';

import {getAll, add} from "../controllers/car-controller.js"
const router = express.Router();

router.route("/")
    .get(getAll)
    .post(add)

export default router;