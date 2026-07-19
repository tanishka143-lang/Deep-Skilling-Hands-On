const { TextEncoder, TextDecoder } = require("util");
global.TextEncoder = TextEncoder;
global.TextDecoder = TextDecoder;

const { ReadableStream, TransformStream } = require("stream/web");
global.ReadableStream = ReadableStream;
global.TransformStream = TransformStream;

const { MessageChannel } = require("worker_threads");
const mc = new MessageChannel();

global.MessageChannel = MessageChannel;
global.MessagePort = mc.port1.constructor;

const Enzyme = require("enzyme");
const Adapter = require("enzyme-adapter-react-16");

Enzyme.configure({ adapter: new Adapter() });
