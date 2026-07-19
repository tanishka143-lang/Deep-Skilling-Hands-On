import axios from "axios";
import GitClient from "./GitClient";

jest.mock("axios");

describe("Git Client Tests", () => {
  test("should return repository names for techiesyed", async () => {
    const mockData = {
      data: [{ name: "repo1" }, { name: "repo2" }],
    };

    axios.get.mockResolvedValue(mockData);

    const result = await GitClient.getRepositories("techiesyed");

    expect(result).toEqual(["repo1", "repo2"]);

    expect(axios.get).toHaveBeenCalledWith(
      "https://api.github.com/users/techiesyed/repos",
    );
  });
});
